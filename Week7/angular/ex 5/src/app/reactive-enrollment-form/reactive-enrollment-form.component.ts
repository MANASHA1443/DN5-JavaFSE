import { Component } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  Validators,
  ReactiveFormsModule,
  FormArray,
  FormControl,
  AbstractControl,
  ValidationErrors
} from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-reactive-enrollment-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './reactive-enrollment-form.component.html',
  styleUrl: './reactive-enrollment-form.component.css'
})
export class ReactiveEnrollmentFormComponent {

  enrollForm: FormGroup;

  constructor(private fb: FormBuilder) {

    this.enrollForm = this.fb.group({

      studentName: ['', [Validators.required, Validators.minLength(3)]],

      studentEmail: ['', {
        validators: [Validators.required, Validators.email],
        asyncValidators: [this.simulateEmailCheck],
        updateOn: 'blur'
      }],

      courseId: ['', [Validators.required, this.noCourseCode]],

      preferredSemester: ['Odd', Validators.required],

      agreeToTerms: [false, Validators.requiredTrue],

      additionalCourses: this.fb.array([])

    });

  }

  noCourseCode(control: AbstractControl): ValidationErrors | null {

    if (control.value && control.value.startsWith('XX')) {

      return { noCourseCode: true };

    }

    return null;

  }

  simulateEmailCheck(control: AbstractControl): Promise<ValidationErrors | null> {

    return new Promise(resolve => {

      setTimeout(() => {

        if (control.value && control.value.includes('test@')) {

          resolve({ emailTaken: true });

        }

        else {

          resolve(null);

        }

      }, 800);

    });

  }

  get additionalCourses() {

    return this.enrollForm.get('additionalCourses') as FormArray;

  }

  addCourse() {

    this.additionalCourses.push(

      new FormControl('', Validators.required)

    );

  }

  removeCourse(index: number) {

    this.additionalCourses.removeAt(index);

  }

  onSubmit() {

    console.log(this.enrollForm.value);

    console.log(this.enrollForm.getRawValue());

  }

}