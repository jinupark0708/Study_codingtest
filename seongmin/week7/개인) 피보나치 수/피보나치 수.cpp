#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    vector<int> v(n + 1);
    v[0] = 0;
    v[1] = 1;
    for (int i = 2; i <= n; i++) {
        v[i] = (v[i - 2] + v[i - 1]) % 1234567;
    }
    return v[n];
}
