package com.ozan.interview;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: oe
 * Date: 10/17/12
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interview {

    public static void levelOrder(ArrayList<BinaryTree> n, int height) {
        ArrayList<BinaryTree> next = new ArrayList<BinaryTree>();
        for (BinaryTree t : n) {
            for (int i = 0 ; i < height * 7; i++)
            {
                System.out.print(" ");
            }
            if (t != null) {

                System.out.print(t.value);
                next.add(t.left);
                next.add(t.right);
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        if(next.size() > 0)
        {
            levelOrder(next, height - 1);
        }
    }

    public static void main(String[] args) throws Exception {

        /*
        // Binary tree
        BinaryTree tree = new BinaryTree(5);
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(9);
        tree.add(4);
        tree.add(7);
        tree.add(12);
        tree.add(15);
        tree.add(0);
        System.out.println("Inorder: " + tree.InOrder());
        System.out.println("Preorder: " + tree.PreOrder());
        System.out.println("Postorder: " + tree.PostOrder());
        System.out.println("LevelOrder:\n" + tree.LevelOrder());
        System.out.println("LCA: " + tree.findLeastCommonAncestor(3,0));

        LinkedList l = new LinkedList(0);
        for (int i = 1; i < 20; i++)
        {
            l.append(i);
        }
        for (int i = -1; i > -20; i--)
        {
            l.append(i);
        }

        BinaryTree b =l.toBinaryTree();
        b.left.right = new BinaryTree(-20);
        System.out.println(b.LevelOrder());
        System.out.println(b.isBinarySearchTree());
        System.out.println(l.toBalancedBinaryTree().LevelOrder());
        System.out.println(l.toBalancedBinaryTree().isBinarySearchTree());
        */

        /*
        // Facebook

        System.out.println(IntegerOperations.sortArrays().toString());
        */

        /*
        // Google

        System.out.println("30's square root is " + IntegerOperations.squareRoot(30));
        System.out.println("50's square root is " + IntegerOperations.squareRoot(50));
        System.out.println("100's square root is " + IntegerOperations.squareRoot(100));
        System.out.println("40.1234's square root is " + IntegerOperations.squareRoot(40.1234));
        */

        /*
        // Palindrome

        Palindrome p = new Palindrome();
        System.out.println('[' + p.findPalindrome("abcdefghijklmnoprsqtuvwyz") + ']');
        System.out.println('[' + p.findPalindrome("Hello guten tag.") + ']');
        System.out.println('[' + p.findPalindrome("Hello  guten  tag.") + ']');
        */

        /*
        // Permutation
        Permutation p = new Permutation();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        ArrayList<ArrayList<Integer>> result = p.findPermutations(a);
        for (ArrayList<Integer> subResult : result)
        {
            System.out.println(subResult);
        }
        */

        /*
        // Anagram
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("adana", "danaa"));
        */


        // LinkedList
        LinkedList l = new LinkedList(0);
        for (int i = 1; i < 20; i++)
        {
            l.append(i);
        }
        for (int i = -1; i > -20; i--)
        {
            l.append(i);
        }
        System.out.println(l);
        LinkedListIterator iterator = new LinkedListIterator(l);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().getData());
        }

        //System.out.println(l);
        //l.reverse();
        //System.out.println(l);
        //System.out.println(l.toBinaryTree().LevelOrder());
        //System.out.println(l.toBalancedBinaryTree().LevelOrder());
        //l.sort();
        //System.out.println(l);


        /*
        // 3 Sum

        Integer[] integers = new Integer[30];
        for (int i = -15; i < 15; i++)
        {
             integers[i + 15] = i;
        }
        System.out.println(ThreeSum.findThreeSum(integers));

        System.out.println(IntegerOperations.fibonacciNumbers(200));
        System.out.println(IntegerOperations.division(22, 7));
        */
        //System.out.println(IntegerOperations.romanToLatin("MDCCCCLXXXXVIIII"));
        //System.out.println(IntegerOperations.clockAngle(2, 45));
        /*
        // Find Duplicates

        System.out.println(StringOperations.findDuplicate3Chars("xcbcabcabcdef"));
        System.out.println(StringOperations.findCommonStrings("abi naber, nasilsin", "iyidir abi! senden naber"));
        */
    }
}