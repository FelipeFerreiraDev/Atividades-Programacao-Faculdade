def dfs(graph, start, visited=None):
    if visited is None:
        visited = set()
    visited.add(start)

    print(start)
   
    if(start != cidadeFinal):
        for next in graph[start] - visited:
            dfs(graph, next, visited)
        return visited
    else:
        exit()
   



graph = {'Oradea': set(['Zerind', 'Sibiu']),
         'Zerind': set(['Arad', 'Oradea']),
         'Arad': set(['Zerind', 'Sibiu', 'Timisoara']),
         'Sibiu': set(['Oradea', 'Fagaras', 'Arad', 'Rimnicu_Vilcea']),
         'Fagaras': set(['Sibiu', 'Bucharest']),
         'Timisoara': set(['Arad', 'Lugoj']),
         'Rimnicu_Vilcea': set(['Sibiu', 'Craiova', 'Pitesti']),
         'Lugoj': set(['Timisoara', 'Mehadia']),
         'Pitesti': set(['Rimnicu_Vilcea', 'Bucharest', 'Craiova']),
         'Mehadia': set(['Lugoj', 'Dobreta']),
         'Craiova': set(['Dobreta', 'Rimnicu_Vilcea', 'Pitesti']),
         'Dobreta': set(['Craiova', 'Mehadia']),
         'Pitesti': set(['Rimnicu_Vilcea', 'Bucharest', 'Craiova']),
         'Bucharest': set(['Pitesti', 'Fagaras', 'Giurgiu', 'Urziceni']),
         'Giurgiu': set(['Bucharest']),
         'Urziceni': set(['Bucharest', 'Hirsova', 'Vaslui']),
         'Hirsova': set(['Urziceni', 'Eforie']),
         'Eforie': set(['Hirsova']),
         'Vaslui': set(['Urziceni', 'Lasi']),
         'Lasi': set(['Vaslui', 'Neamt']),
         'Neamt': set(['Lasi']),
    }

cidadeInicial = str(input('Cidade inicial: '))
cidadeFinal = str(input('Cidade final: '))

dfs(graph, cidadeInicial)


