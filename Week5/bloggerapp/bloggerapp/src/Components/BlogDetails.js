function BlogDetails() {

    const blogs = [
        {
            id: 1,
            title: "React Basics",
            author: "John"
        },
        {
            id: 2,
            title: "Conditional Rendering",
            author: "David"
        }
    ];

    return (
        <div>
            <h2>Blog Details</h2>

            {blogs.map((blog) => (
                <div key={blog.id}>
                    <h3>{blog.title}</h3>
                    <p>Author : {blog.author}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default BlogDetails;