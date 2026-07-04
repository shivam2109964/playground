void main() {
  // Way one
  int a = 12;
  int b = 8;
  int sum = a + b;
  print(sum);

  // Way two
  print(a + b);

  // Way three
  int sumRes = add(a, b);
  print(sumRes);
  adding(a, b);
}

int add(int a, int b) {
  return a + b;
}

void adding(int a, int b) {
  print(a + b);
}
