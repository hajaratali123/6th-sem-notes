import collections

def bfs(graph, root):
    visited, queue = set(), collections.deque([root])
    visited.add(root)

    while queue:
        vertex = queue.popleft()
        print(vertex)

        for neighbor in graph[vertex]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)

# Example usage
if __name__ == "__main__":
    graph = {
        0: [1, 2],
        1: [2],
        2: [3],
        3: [1, 2]
    }
    print("\nBFS traversal:")
    bfs(graph, 0)
