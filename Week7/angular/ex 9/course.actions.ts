import { createAction, props } from '@ngrx/store';

export interface Course {
  id: number;
  name: string;
  code: string;
  credits: number;
  gradeStatus: 'passed' | 'failed' | 'pending';
}

export const loadCourses = createAction(
  '[Course] Load Courses'
);

export const loadCoursesSuccess = createAction(
  '[Course] Load Courses Success',
  props<{ courses: Course[] }>()
);

export const loadCoursesFailure = createAction(
  '[Course] Load Courses Failure',
  props<{ error: string }>()
);

export const enrollInCourse = createAction(
  '[Course] Enroll',
  props<{ courseId: number }>()
);

export const unenrollFromCourse = createAction(
  '[Course] Unenroll',
  props<{ courseId: number }>()
);