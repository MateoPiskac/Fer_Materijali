print ('LU')
L = A.dekompozicijaLU().vratiMatricuL()
print ('L:')
L.isprintaj()
U = A.dekompozicijaLU().vratiMatricuU()
Y = L.supstitucijaUnaprijed(B)
print ('Y:')
Y.isprintaj()
X = U.supstitucijaUnatrag(Y)
print ('X:')
X.isprintaj()
