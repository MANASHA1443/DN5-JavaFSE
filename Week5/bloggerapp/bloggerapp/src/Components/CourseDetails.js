function CourseDetails() {

    const courses = [
        {
            id: 1,
            name: "React",
            duration: "30 Days"
        },
        {
            id: 2,
            name: "Angular",
            duration: "45 Days"
        }
    ];

    return (
        <div>
            <h2>Course Details</h2>

            {courses.map((course) => (
                <div key={course.id}>
                    <h3>{course.name}</h3>
                    <p>Duration : {course.duration}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default CourseDetails;