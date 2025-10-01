// A. Be Positive
// time limit per test1 second
// memory limit per test256 megabytes
// Given an array a
//  of n
//  elements, where each element is equal to −1
// , 0
// , or 1
// . In one operation, you can choose an index i
//  and increase ai
//  by 1
//  (that is, assign ai:=ai+1
// ). Operations can be performed any number of times, choosing any indices.

// The goal is to make the product of all elements in the array strictly positive with the minimum number of operations, that is, a1⋅a2⋅a3⋅…⋅an>0
// . Find the minimum number of operations.

// It is guaranteed that this is always possible.

// Input
// Each test consists of several test cases.

// The first line contains one integer t
//  (1≤t≤104
// ) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains one integer n
//  (1≤n≤8
// ) — the length of the array a
// .

// The second line contains n
//  integers a1,a2,…,an
// , where −1≤ai≤1
//  — the elements of the array a
// .

// Output
// For each test case, output one integer — the minimum number of operations required to make the product of the elements in the array strictly positive.

// Example
// InputCopy
// 3
// 3
// -1 0 1
// 4
// -1 -1 0 1
// 5
// -1 -1 -1 0 0
// OutputCopy
// 3
// 1
// 4
// Note
// In the first test case: from [−1,0,1]
// , you can obtain [1,1,1]
//  in 3
//  operations.

// In the second test case: it is enough to perform 0→1
//  (1 operation). In the resulting array a=[−1,−1,1,1]
// , the product of all elements is 1
// .

// In the third test case: turning two zeros into ones (2 operations), and one −1
//  into 1
//  (another 2 operations), for a total of 4
// .

// B. Unconventional Pairs
// time limit per test2 seconds
// memory limit per test256 megabytes
// A popular reality show Unconventional Pairs has been launched in the city. According to the rules of the show, participants are paired in an unusual way: with an even number of people, all participants must be in pairs.

// Petya has an array of n
//  integers a1,a2,…,an
// . It is known that n
//  is even. Petya must divide the participants (numbers) into exactly n2
//  pairs (ap1,aq1),(ap2,aq2),…(apn2,aqn2)
// . Each index can be included in no more than one pair.

// For a pair (x,y)
// , its difference is defined as |x−y|
// . Petya wants to form unconventional pairs such that the maximum difference among all pairs is minimized.

// Determine the minimum possible value of this maximum difference.

// Input
// Each test consists of several test cases.

// The first line contains a single integer t
//  (1≤t≤104
// ) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains one even number n
//  (2≤n≤2⋅105
// ) — the length of the array a
// .

// The second line contains n
//  integers a1,a2,…,an
//  (−109≤ai≤109)
//  — the elements of the array a
// .

// It is guaranteed that the sum of the values of n
//  across all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output a single number — the minimum possible maximum difference between the elements in pairs.

// Example
// InputCopy
// 5
// 2
// 1 2
// 4
// 10 1 2 9
// 6
// 3 8 9 3 3 2
// 8
// 5 5 5 5 5 5 5 5
// 4
// -5 -1 2 6
// OutputCopy
// 1
// 1
// 1
// 0
// 4
// Note
// In the first test case, the array is: [1,2]
// . The only possible (and therefore optimal) pair is (1,2)
// , its difference is |1−2|=1
// , the answer is 1
// .

// In the second test case, the array is: [10,1,2,9]
// . We can choose pairs — (1,2)
//  and (9,10)
// : both differences are equal to 1
// , therefore, the maximum difference is 1
// .

// In the third test case, the array is: [3,8,9,3,3,2]
// . We can choose pairs: (2,3)
// , (3,3)
// , (8,9)
// . The differences are: 1,0,1
//  — the largest is 1
// .


