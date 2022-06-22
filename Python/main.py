### @Author: Felipe Ferreira Dev


import collections

# Algoritmo BFS

# Define função (graph = mapa/grafo, city_begin = cidade inicial, city_end = cidade final)
def bfs(graph, city_begin, city_end):

    # Visited -> Seta como vazio, deque -> maneira mais facil de trabalhar com listas
    visited, lista = set(), collections.deque([city_begin])
    visited.add(city_begin)

    while lista:

        # Retira um vertice da fila (vertex = vertice)
        vertex = lista.popleft()
        print(str(vertex) + " ", end="")
        if city_end == str(vertex):
            exit()


        # Percorre o grafo pelo vertice e atribui ao neighbour
        for neighbour in graph[vertex]:
            # Se ele ainda não foi visitado, é adicionado a lista de visitado
            # Visited -> Lista de visitados
            if neighbour not in visited:
                visited.add(neighbour)
                # Insere um registro após último elemento
                lista.append(neighbour)


# Controle do escopo da execução
if __name__ == '__main__':
    graph = { 
    "Oradea": ["Zerind", "Sibiu"],
    "Zerind": ["Arad", "Oradea"],
    "Arad": ["Zerind", "Sibiu", "Timisoara"],
    "Sibiu": ["Oradea", "Fagaras", "Arad", "Rimnicu_Vilcea"],
    "Fagaras": ["Sibiu", "Bucharest"],
    "Timisoara": ["Arad", "Lugoj"],
    "Rimnicu_Vilcea": ["Sibiu", "Craiova", "Pitesti"],
    "Lugoj": ["Timisoara", "Mehadia"],
    "Pitesti":["Rimnicu_Vilcea", "Bucharest", "Craiova"],
    "Mehadia":["Lugoj", "Dobreta"],
    "Dobreta":["Mehadia", "Craiova"],
    "Craiova":["Dobreta", "Rimnicu_Vilcea", "Pitesti"],
    "Bucharest":["Pitesti", "Fagaras", "Giurgiu", "Urziceni"],
    "Giurgiu":["Bucharest"],
    "Urziceni":["Bucharest", "Hirsova", "Vaslui"],
    "Hirsova":["Urziceni", "Eforie"],
    "Eforie":["Hirsova"],
    "Vaslui":["Urziceni", "Lasi"],
    "Lasi":["Vaslui", "Neamt"],
    "Neamt":["Lasi"]
}

    # Pede para o usuário as cidades
    city_begin = input("Digite a cidade inicial: \n")
    city_end = input("Digite a cidade final: \n")
    print("\n****************************************")
    # Chama a função
    bfs(graph, city_begin, city_end)
