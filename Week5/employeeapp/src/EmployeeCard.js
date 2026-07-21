import { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard(props) {

    const theme = useContext(ThemeContext);

    return (
        <div>
            <h3>{props.employee.name}</h3>

            <p>ID : {props.employee.id}</p>

            <p>Email : {props.employee.email}</p>

            <p>Phone : {props.employee.phone}</p>

            <button className={theme}>
                View Details
            </button>
        </div>
    );
}

export default EmployeeCard;