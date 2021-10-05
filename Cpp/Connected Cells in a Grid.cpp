//https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem

#include <cstdio>
#include <queue>
#include <utility>

using namespace std;

int m, n;
int grid[16][16];

bool vis[16][16];

int bfs(int a, int b) {
    queue<pair<int, int> > q;
    q.push(make_pair(a, b));
    
    int k = 0;

    while (!q.empty()) {
        pair<int, int> cur = q.front();
        q.pop();

        if (vis[cur.first][cur.second]) {
            continue;
        }
        vis[cur.first][cur.second] = true;
        k++;

        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                int ci = cur.first + di;
                int cj = cur.second + dj;
                if (ci >= 0 && ci < m && cj >= 0 && cj < n && grid[ci][cj] && !vis[ci][cj]) {
                    q.push(make_pair(ci, cj));
                }
            }
        }
    }

    return k;
}

int main() {
    scanf("%d %d", &m, &n);
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &grid[i][j]);
        }
    }
    
    int ans = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] && !vis[i][j]) {
                ans = max(ans, bfs(i, j));
            }
        }
    }

    printf("%d\n", ans);
}
