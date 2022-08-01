public class DetermineGroup {
public int determineGroup(int age) {
    int group = 0;
    if (Boolean.logicalAnd(age >= 7, age <= 13)) {
        group = 1;
    } else if (Boolean.logicalAnd(age >= 14, age <= 17)) {
        group = 2;
    } else if (Boolean.logicalAnd(age >= 18, age <= 65)) {
        group = 3;
    } else {
        group = -1;
    }
    return group;
}
}
