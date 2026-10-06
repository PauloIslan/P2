num = int(input("Digite o numero: "))

print("---tabuada com FOR---")

for i in range(1, 11):
    print(f"{num} x {i:2d} = {num * i}")
    
print("\n--- Tabuada com WHILE ---")
    
i = 1
    
while i <= 10:
        print(f"{num} x {i:2d} = {num * i}")
        i += 1