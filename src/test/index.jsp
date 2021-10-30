<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet" href="css/style.css"  >




</head>
<body>

	<div class="container">
        <header>
			<div class="banner"></div>
			<h1>Nura Rose</h1>
        </header>
		<table class="menu">
			<tr>
				<td><a href="#">Home Page</a></td>
				<td><a href="#">item</a></td>
				<td><a href="#">item</a></td>

			</tr>
		</table>
		<main>
			<div class="products">
				<div class="single-products" data-id="1">
                    <div class="img-container">
                        <img src="/rosestore/images/Arboricola.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">Arboricola</h3>
                </div>

				<div class="single-products" data-id="2">
                    <div class="img-container">
                        <img src="images/Carton.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">Carton</h3>
                </div>
				<div class="single-products" data-id="3">
                    <div class="img-container">
                        <img src="images/cast iron milky.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">cast iron milky</h3>
                </div>
				<div class="single-products" data-id="4">
                    <div class="img-container">
                        <img src="images/Cast Iron.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">Cast Iron</h3>
                </div>
				<div class="single-products" data-id="5">
                    <div class="img-container">
                        <img src="images/com cane.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">com cane</h3>
                </div>
				<div class="single-products" data-id="6">
                    <div class="img-container">
                        <img src="images/Janet.png" alt="picture"> 

                    </div>
                    <h3 class="img-name">Janet</h3>
                </div>
				<div class="single-products" data-id="7">
                    <div class="img-container">
                        <img src="images/Rubber Plant.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">Rubber Plant</h3>
                </div>
				<div class="single-products" data-id="8">
                    <div class="img-container">
                        <img src="images/selloum philodendron.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">selloum philodendron</h3>
                </div>
				<div class="single-products" data-id="9">
                    <div class="img-container">
                        <img src="images/Sensevera Black Coral.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">Sensevera Black Coral</h3>
                </div>
				<div class="single-products"data-id="10">
                    <div class="img-container">
                        <img src="images/variegated arboicola.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">variegated arboicola</h3>
                </div>
				<div class="single-products"data-id="11">
                    <div class="img-container">
                        <img src="images/wamickii lemon lime.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">wamickii lemon lime</h3>
                </div>
				<div class="single-products"data-id="12">
                    <div class="img-container">
                        <img src="images/wamickii.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">wamickii</h3>
                </div>
				<div class="single-products"data-id="13">
                    <div class="img-container">
                        <img src="images/ZZ Plants.png" alt="picture"> 
                    </div>
                    <h3 class="img-name">ZZ Plants</h3>
                </div>
			
			</div >
			<div class="side">
			
			<h1>CART</h1>
			<table class="table" id="table">
				<tr>
					<th>Plant Name</th>
					<th>Amount</th>
					<th>Price</th>
					<th></th>
				
				</tr>
                
				
				

				


			</table>
            <form action="processBuy" method="POST">
                <br>
                <label>Total</label>
                <input class="formtotal" type="text" id="formtotal">
                <br>
                <input type="submit" value="Buy">
                
            </form>
		</div>
		</main>
	</div>
	<script src="scripts/code.js" ></script>
</body>
</html>
    