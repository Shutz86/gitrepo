# gitshutz

Please describe in a few sentences the MVC architecture:

MVC-  stands for Model -View- Controller , it describes an architectural pattern for implementation of user 
interfaces. This commonly used model  separates internal representations of information from the way
it is presented to it’s user.  


Write a program that prints the numbers from 1 to 100. But for multiples of three print “Bud” instead of the number and for the multiples of five print “Soft”. 
For numbers which are multiples of both three and five print “BudSoft”.
in java:

public class BudSoftCount {
	public static void main(String[] args) {
		for (int i = 1; i<100; i++)
		{
			if(i % 3 == 0 && i%5 == 0)
				System.out.println("BudSoft");
			else if (i % 3 ==0 )
				System.out.println("Bud");
			else if (i % 5 ==0)
				System.out.println("Soft");
			else
				System.out.println(i);
		}
	}
}


Explain the difference (in Javascript) between "==" & "===" logical operators:

The main difference between “==“ and “===“  is basically  if you compare a number
with a string with numeric literal “==“ allows it to happen while “===“ does not, 
it checks the value and the type as well. 



Extend the "Array" class in Javascript with a new method that calculates and returns the 
sum of the Array's items (you can assume all of the items are number).

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Solution 4</title>
    <script>
        Array.prototype.sumItems = function() {
            var sum = 0;
            for (var i = 0; i < this.length; i++) {
                sum += this[i];
            }
            return sum;
        }
        var myArray = new Array();
        function addNum(input) {
            myArray.push(parseInt(document.getElementById("numbersInput").value,10));
            updateUI();
        }
        
        function updateUI() {
            var valuesContainer = document.getElementById("valuesContainer");
            valuesContainer.innerHTML = "";
            for (var i = 0; i < myArray.length; i++) {
                valuesContainer.innerHTML += myArray[i];
                if (i < myArray.length - 1) {
                    valuesContainer.innerHTML += ", ";
                }
            }
            var sumContainer = document.getElementById("sumContainer");
            sumContainer.innerHTML = myArray.sumItems();
        }
    </script>
</head>
<body>
    <div>
        <div><input type="text" id="numbersInput" onfocus="this.value = '';"><button onclick="addNum()">Add to array</button></div>
        <div>Array values: <span id="valuesContainer"></span></div>
        <div>Array sum: <span id="sumContainer"></span></div>
    </div>
</body>
</html>



