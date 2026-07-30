import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCardComponent } from '../course-card/course-card.component';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent implements OnInit {

  isLoading = true;

  selectedCourseId = 0;

  courses = [
    {
      id: 101,
      name: 'Angular',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed',
      enrolled: true
    },
    {
      id: 102,
      name: 'Java',
      code: 'JAVA102',
      credits: 3,
      gradeStatus: 'pending',
      enrolled: false
    },
    {
      id: 103,
      name: 'Spring Boot',
      code: 'SPR103',
      credits: 4,
      gradeStatus: 'failed',
      enrolled: false
    },
    {
      id: 104,
      name: 'React',
      code: 'RE104',
      credits: 2,
      gradeStatus: 'passed',
      enrolled: true
    },
    {
      id: 105,
      name: 'SQL',
      code: 'SQL105',
      credits: 3,
      gradeStatus: 'pending',
      enrolled: false
    }
  ];

  ngOnInit(): void {

    setTimeout(() => {
      this.isLoading = false;
    }, 1500);

  }

  onEnroll(id: number) {

    console.log("Enrolling in course :", id);

    this.selectedCourseId = id;

  }

  trackByCourseId(index: number, course: any) {

    return course.id;

  }

}