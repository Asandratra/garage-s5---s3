<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/index.css">
    <link rel="stylesheet" href="assets/fontawesome-5/css/all.css">
    <link rel="stylesheet" href="">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h2>Insertion des employées</h2>
        <form action="" method="post">
            <div><label >Nom:</label><input type="text" name="nom" ></div>
            <div><label >Prenom:</label><input type="text" name="prenom" ></div>
            <div><label >Date de naissance</label><input type="date" name="dtn" ></div>
            <div><label >Genre</label>
                <select name="genre">
                    <option value="homme">homme</option>
                    <option value="femme">femme</option>
                </select>
            </div>
            <div><label >Niveau d'étude</label>
                <select name="niveau">
                    <option value="bacc">bacc</option>
                    <option value="licence">licence</option>
                </select>
            </div>
            <div><label >Spécialité</label>
                <select name="specialte">
                    <option value="soudure">soudure</option>
                    <option value="electricien">electricien</option>
                    <option value="mecanicien">mecanicien</option>
                </select>
            </div>
            <div class="btn"><input type="submit" value="Ajouter"></div>
        </form>
    </div>
</body>
</html>