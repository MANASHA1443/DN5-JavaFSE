function BookDetails() {
    const books = [
        {
            id: 1,
            name: "React in Action",
            author: "Mark Tielens Thomas"
        },
        {
            id: 2,
            name: "Learning React",
            author: "Alex Banks"
        }
    ];

    return (
        <div>
            <h2>Book Details</h2>

            {books.map((book) => (
                <div key={book.id}>
                    <h3>{book.name}</h3>
                    <p>Author : {book.author}</p>
                    <hr />
                </div>
            ))}
        </div>
    );
}

export default BookDetails;