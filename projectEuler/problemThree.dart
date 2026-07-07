void main() {
  int number = 600851475143;
  for (int i = 2; i * i <= number; i++) {
    while (number % i == 0) {
      print(i);
      number ~/= i;
    }
  }

  // if anything is left is also a prime number
  if (number > 1) {
    print(number);
  }
}
