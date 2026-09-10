class Solution(object):
    def isSameAfterReversals(self, num):
        #rev1 = list(str(num))
        #rev1.reverse()
        #rev1 = int(''.join(rev1))

        #rev2 = list(str(rev1))
        #rev2.reverse()
        #rev2 = int(''.join(rev2))
        #return rev2==num

        #2nd var

        return num == int(str(int(str(num)[::-1]))[::-1])



