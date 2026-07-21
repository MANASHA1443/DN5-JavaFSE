import { useState } from "react";
import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function LoginControl() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const handleLogin = () => {
        setIsLoggedIn(true);
    };

    const handleLogout = () => {
        setIsLoggedIn(false);
    };

    let button;

    if (isLoggedIn) {
        button = <LogoutButton onClick={handleLogout} />;
    } else {
        button = <LoginButton onClick={handleLogin} />;
    }

    return (
        <div style={{ margin: "40px" }}>
            <Greeting isLoggedIn={isLoggedIn} />
            <br />
            {button}
        </div>
    );
}

export default LoginControl;