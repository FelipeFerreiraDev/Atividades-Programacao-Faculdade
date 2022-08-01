def moveTower(height, fromPole, toPole, withPole):
    if height >= 1:
        moveTower(height-1,fromPole,withPole,toPole)
        print("Movendo o disco: " , height)
        moveDisk(fromPole,toPole)
        moveTower(height-1,withPole,toPole,fromPole)

def moveDisk(fp,tp):
    print("Movendo o disco de", fp, "para", tp, "\n")

moveTower(3, "A", "C", "B")
