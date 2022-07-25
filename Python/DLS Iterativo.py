grafo = { #inicializa o grafo com as cidades
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

visited = set()
cont = 0


def dfs(visited, graph, node, destino, limite, cont):
    if node not in visited:
        print (node)
        visited.add(node)
        cont += 1
        if node == destino:
            exit()
        elif cont == limite:
            print('\n Chegou no limite')
            print('\n Indo para a próxima parte \n')
            cont = 0
            limite += 1
            dfs(visited, grafo, cidadeInicial, cidadeFinal, limite, cont)
            print('\n Valor do limite:', limite)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour, destino, limite, cont)

cidadeInicial = str(input('Cidade inicial: '))
cidadeFinal = str(input('Cidade final: '))
limite = 1


dfs(visited, grafo, cidadeInicial, cidadeFinal, limite, cont)
