document.getElementById('convertBtn').addEventListener('click', function() {

  const tempInput = parseFloat(document.getElementById('tempInput').value);
  const unitSelect = document.getElementById('unitSelect').value;
  let result;


    // Conversion of Celsius to Fahrenheit and Kelvin
  if (unitSelect === 'C') {
      const fahrenheit = (tempInput * 9/5) + 32;
      const kelvin = tempInput + 273.15;
      result = `${tempInput} °C is ${fahrenheit.toFixed(2)} °F and ${kelvin.toFixed(2)} K`;
  }
    // Conversion of Fahrenheit to Celsius and Kelvin
  else if (unitSelect === 'F') {
      const celsius = (tempInput - 32) * 5/9;
      const kelvin = celsius + 273.15;
      result = `${tempInput} °F is ${celsius.toFixed(2)} °C and ${kelvin.toFixed(2)} K`;
  } 
   // Conversion of Kelvin to Celsius and Fahrenheit
  else {
      const celsius = tempInput - 273.15;
      const fahrenheit = (celsius * 9/5) + 32;
      result = `${tempInput} K is ${celsius.toFixed(2)} °C and ${fahrenheit.toFixed(2)} °F`;
  }

  document.getElementById('result').innerText = result;
});
