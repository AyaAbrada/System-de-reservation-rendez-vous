<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<head>
<title>Systéme De Résérvation Des Rendez-Vous Médéicaux</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
</head>
<body>
<p class ="bg-success rounded p-3 m-3 text-center text-light">Demander un rendez-vous:</p>

    <form class="formulaire m-3" id="form-contact">
        <div class="mb-3">
            <label for="validationServer01" class="form-label">Username :</label>
            <input type="text" class="form-control" id="validationServer01" required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>

        <div class="mb-3">
            <label for="emailInput" class="form-label">Email :</label>
            <div class="input-group has-validation">
                <!--<span class="input-group-text" id="inputGroupPrepend3">@</span> -->
                <input type="email" class="form-control" id="emailInput" aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback" required>
                <div id="validationServerUsernameFeedback" class="invalid-feedback">
                    Please enter a valid email.
                </div>
            </div>
        </div>

        <div class="mb-3">
            <label for="phoneInput" class="form-label">Numéro de téléphone :</label>
            <div class="input-group has-validation">
                <input type="tel" class="form-control" id="phoneInput" aria-describedby="validationServerUsernameFeedback" pattern="^\d{10}$" required>
                <div id="validationServerUsernameFeedback" class="invalid-feedback">
                    Le numéro de téléphone doit comporter 10 chiffres.
                </div>
            </div>
        </div>

        <div class="mb-3">
            <label for="validationServer02" class="form-label">Raison de visite :</label>
            <input type="text" class="form-control" id="validationServer02" required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>

        <button type="submit" class="btn btn-success">Envoyer</button>
    </form>

    <div class="d-flex flex-column align-items-center">
        <a href="consulter.jsp" class="bg-success rounded p-3 m-3 text-center text-light">Consulter les rendez-vous</a>
        <a href="annuler.jsp" class="bg-success rounded p-3 m-3 text-center text-light">Annuler un rendez-vous</a>
    </div>

</body>
</html>