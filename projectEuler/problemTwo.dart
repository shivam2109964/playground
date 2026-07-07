void main() {
  int constant = 1;
  int initial = 1;
  int next;
  int sum = 0;
  while (true) {
    next = constant + initial;
    if (next.isEven) {
      sum += next;
    }
    constant = initial;
    initial = next;
    if (next > 4000000) {
      break;
    }
  }
  print(sum);
}
