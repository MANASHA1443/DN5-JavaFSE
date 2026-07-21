import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = false;

    return (
        <div>

            <h1>Blogger App</h1>

            {/* if using && operator */}

            {showBooks && <BookDetails />}

            {/* Ternary Operator */}

            {showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

            {/* Another Ternary */}

            {showCourses ? <CourseDetails /> : <h3>Courses Hidden</h3>}

        </div>
    );
}

export default App;