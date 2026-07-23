import React, { Component } from "react";

class Getuser extends Component {

    constructor(props) {
        super(props);

        this.state = {
            title: "",
            first: "",
            picture: "",
            loading: true
        };
    }

    async componentDidMount() {

        const url = "https://api.randomuser.me/";

        const response = await fetch(url);

        const data = await response.json();

        this.setState({
            title: data.results[0].name.title,
            first: data.results[0].name.first,
            picture: data.results[0].picture.large,
            loading: false
        });

        console.log(data.results[0]);
    }

    render() {

        if (this.state.loading) {
            return <h2>Loading...</h2>;
        }

        return (
            <div style={{ margin: "40px" }}>
                <h1>
                    {this.state.title} {this.state.first}
                </h1>

                <img
                    src={this.state.picture}
                    alt="User"
                />
            </div>
        );
    }
}

export default Getuser;