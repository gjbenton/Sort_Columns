# Sort_Columns
Time Analyis:
List<Integer> minDeletionSize(String[] given)

if(valid(given)) statement itself is O(1) - jumps to valid function. Worst case: O(n)
nested for loop ~ O(n*4n) = O(4n^2)

return + else statement = O(3)

Total = 1 + n * 4n + 3 = O(n^2)

Space Analysis:
worst case: O(n) and that would be if the array given is in reverse sorted order because then the list deletedIndex adds n elements.
