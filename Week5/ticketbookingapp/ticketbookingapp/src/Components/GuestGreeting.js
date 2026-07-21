function GuestGreeting() {
    return (
        <div>
            <h1>Please sign up.</h1>

            <h3>Flight Details</h3>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Time</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>10:30 AM</td>
                    </tr>

                    <tr>
                        <td>AI202</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>2:00 PM</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default GuestGreeting;