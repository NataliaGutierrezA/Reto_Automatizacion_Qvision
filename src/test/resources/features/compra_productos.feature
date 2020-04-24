Feature: Comprar productos
    Yo como usuaria quiero comprar productos en saucedemo.

    @Caso1
    Scenario Outline: Compra exitosa de un producto en Saucedemo.
        Given Ella carga la informacion de la compra
        When Ella realiza la autenticacion con <username> y <password> en la plataforma
        When Ella realiza la compra de un producto con <first name>, <last name> y <postal code>
        Then Ella verifica que la compra fue realizada de manera exitosa

        Examples:
        |username|password|first name|last name|postal code|
        |standard_user|secret_sauce|Claudia|Uribe|57|
        |problem_user|secret_sauce|Julian|Arango|57|
        |performance_glitch_user|secret_sauce|Martin|Gutierrez|57|





