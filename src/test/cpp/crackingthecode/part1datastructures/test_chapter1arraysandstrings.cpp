#include "gtest/gtest.h"
#include "chapter1arraysandstrings.h"

TEST(chapter1arraysandstrings, test_isUniqueCharacters) {
    ASSERT_TRUE(!isUniqueCharacters('\0'));
    ASSERT_TRUE(!isUniqueCharacters(NULL));
    ASSERT_TRUE(!isUniqueCharacters(""));
    ASSERT_TRUE(isUniqueCharacters("abc"));
    ASSERT_TRUE(!isUniqueCharacters("aab"));
    ASSERT_TRUE(isUniqueCharacters("qazwsxedcrfvtgbyhnujmikolp"));
    ASSERT_TRUE(!isUniqueCharacters("qwertyuiopplkjhgfdsazxcvbnm"));
}