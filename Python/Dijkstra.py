from collections import defaultdict
from heapq import *

def dijkstra(edges, ini, final):
    lista = defaultdict(list)
    for left, right, weight in edges:
        lista[left].append((weight,right))

    q, visitados, mins = [(0,ini,())], set(), {ini: 0}
    while q:
        (cost,v1,path) = heappop(q)
        
        if v1 not in visitados:
            visitados.add(v1)
            path += (v1, )
            if v1 == final: return print(path, "| custo: ", cost)

            for weight, v2 in lista.get(v1, ()):
                if v2 in visitados: continue
                prev = mins.get(v2, None)
                next = cost + weight
                if prev is None or next < prev:
                    mins[v2] = next
                    heappush(q, (next, v2, path))

    return float("inf"), None

if __name__ == "__main__":
    edges = [
        ("Oradea", "Zerind", 71),
        ("Oradea", "Sibiu", 151),
        ("Zerind", "Arad", 75),
        ("Zerind", "Oradea", 71),
        ("Arad", "Zerind", 75),
        ("Arad", "Sibiu", 140),
        ("Arad", "Timisoara", 118),
        ("Sibiu", "Oradea", 151),
        ("Sibiu", "Fagaras", 99),
        ("Sibiu", "Arad", 140),
        ("Sibiu", "Rimnicu_Vilcea", 80),
        ("Fagaras", "Sibiu", 99),
        ("Fagaras", "Bucharest", 211),
        ("Timisoara", "Arad", 118),
        ("Timisoara", "Lugoj", 111),
        ("Rimnicu_Vilcea", "Sibiu", 80),
        ("Rimnicu_Vilcea", "Craiova", 146),
        ("Rimnicu_Vilcea", "Pitesti", 97),
        ("Lugoj", "Timisoara", 111),
        ("Lugoj", "Mehadia", 70),
        ("Pitesti", "Rimnicu_Vilcea", 97),
        ("Pitesti", "Bucharest", 101),
        ("Pitesti", "Craiova", 138),
        ("Mehadia", "Lugoj", 70),
        ("Mehadia", "Dobreta", 75),
        ("Craiova", "Dobreta", 120),
        ("Craiova", "Rimnicu_Vilcea", 146),
        ("Craiova", "Pitesti", 138),
        ("Dobreta", "Craiova", 120),
        ("Dobreta", "Mehadia", 75),
        ("Bucharest", "Pitesti", 101),
        ("Bucharest", "Fagaras", 211),
        ("Bucharest", "Giurgiu", 90),
        ("Bucharest", "Urziceni", 85),
        ("Giurgiu", "Bucharest", 90),
        ("Urziceni", "Bucharest", 85),
        ("Urziceni", "Hirsova", 98),
        ("Urziceni", "Vaslui", 142),
        ("Hirsova", "Urziceni", 98),
        ("Hirsova", "Eforie", 86),
        ("Eforie", "Hirsova", 86),
        ("Vaslui", "Urziceni", 142),
        ("Vaslui", "Lasi", 92),
        ("Lasi", "Vaslui", 92),
        ("Lasi", "Neamt", 87),
        ("Neamt", "Lasi", 87),
    ]
    
    cidadeInicial = str(input("Cidade Inicial: "))
    cidadeFinal = str(input("Cidade Final: "))

    dijkstra(edges, cidadeInicial, cidadeFinal)
