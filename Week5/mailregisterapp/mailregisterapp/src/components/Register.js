import React, { useState } from "react";

function Register() {

  const [formData, setFormData] = useState({
    name: "",
    email: "",
    password: ""
  });

  const [errors, setErrors] = useState({
    name: "",
    email: "",
    password: ""
  });

  const handleChange = (event) => {

    const { name, value } = event.target;

    setFormData({
      ...formData,
      [name]: value
    });

    let error = "";

    switch (name) {

      case "name":
        error =
          value.length < 5
            ? "Name should have at least 5 characters"
            : "";
        break;

      case "email":
        error =
          value.includes("@") && value.includes(".")
            ? ""
            : "Email is not valid";
        break;

      case "password":
        error =
          value.length < 8
            ? "Password should have at least 8 characters"
            : "";
        break;

      default:
        break;
    }

    setErrors({
      ...errors,
      [name]: error
    });

  };

  const handleSubmit = (event) => {

    event.preventDefault();

    if (errors.name || errors.email || errors.password) {

      if (errors.name)
        alert(errors.name);

      else if (errors.email)
        alert(errors.email);

      else if (errors.password)
        alert(errors.password);

    } else {

      alert("Registered Successfully");

    }

  };

  return (

    <div style={{ margin: "40px" }}>

      <h1 style={{ color: "red" }}>
        Register Here!!!
      </h1>

      <form onSubmit={handleSubmit}>

        <table>

          <tbody>

            <tr>

              <td>Name:</td>

              <td>

                <input
                  type="text"
                  name="name"
                  value={formData.name}
                  onChange={handleChange}
                />

              </td>

            </tr>

            <tr>

              <td>Email:</td>

              <td>

                <input
                  type="text"
                  name="email"
                  value={formData.email}
                  onChange={handleChange}
                />

              </td>

            </tr>

            <tr>

              <td>Password:</td>

              <td>

                <input
                  type="password"
                  name="password"
                  value={formData.password}
                  onChange={handleChange}
                />

              </td>

            </tr>

            <tr>

              <td></td>

              <td>

                <button type="submit">
                  Submit
                </button>

              </td>

            </tr>

          </tbody>

        </table>

      </form>

    </div>

  );

}

export default Register;