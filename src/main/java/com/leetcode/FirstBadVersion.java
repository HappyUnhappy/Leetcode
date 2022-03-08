package com.leetcode;

class VersionControl {
    private static int badVersion = 1;

    public void setBadVersion(int version) {
        badVersion = version;
    }

    public boolean isBadVersion(int version) {
        return badVersion <= version;
    }
}

public class FirstBadVersion extends VersionControl{
    public int firstBadVersion(int n) {
        int startVersion = 1;
        int endVersion = n;
        int result = 1;

        while (startVersion <= endVersion) {
            int midVersion = startVersion + (endVersion - startVersion) / 2;

            if (isBadVersion(midVersion)) {
                result = midVersion;
                endVersion = midVersion - 1;
            } else {
                startVersion = midVersion + 1;
            }
        }

        return result;
    }
}
