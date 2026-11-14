class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        answer = 0
        for i in range(len(digits)):
            answer = (answer * 10) + digits[i]

        answer = answer + 1

        result = []

        while answer > 0:
            digit = answer % 10
            result.append(digit)
            answer = answer // 10
        
        result.reverse()
        
        return result