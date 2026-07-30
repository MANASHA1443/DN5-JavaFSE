import { Injectable } from '@angular/core';

export interface Course {
  id: number;
  name: string;
  code: string;
  credits: number;
  gradeStatus: 'passed' | 'failed' | 'pending';
}

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private courses: Course[] = [

    {
      id: 101,
      name: 'Angular',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed'
    },

    {
      id: 102,
      name: 'Java',
      code: 'JAVA102',
      credits: 3,
      gradeStatus: 'pending'
    },

    {
      id: 103,
      name: 'Spring Boot',
      code: 'SPR103',
      credits: 4,
      gradeStatus: 'failed'
    },

    {
      id: 104,
      name: 'React',
      code: 'RE104',
      credits: 3,
      gradeStatus: 'passed'
    },

    {
      id: 105,
      name: 'SQL',
      code: 'SQL105',
      credits: 2,
      gradeStatus: 'pending'
    }

  ];

  constructor() { }

  getCourses(): Course[] {
    return this.courses;
  }

  getCourseById(id: number): Course | undefined {
    return this.courses.find(course => course.id === id);
  }

  addCourse(course: Course): void {
    this.courses.push(course);
  }

}