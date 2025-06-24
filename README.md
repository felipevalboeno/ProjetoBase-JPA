# ProjetoBase-JPA

Um projeto simples demonstrando o uso de **Java Persistence API (JPA)** para persistência de dados em Java.

---

## 🧠 O que é Persistência em Java?

Imagine que seu programa Java cria um objeto `Produto` com nome e preço. Se esse objeto não for salvo em algum lugar, ele desaparecerá assim que o programa for encerrado.

**Persistência** é o processo de armazenar esses dados de forma permanente, normalmente em um banco de dados (MySQL, PostgreSQL, H2, entre outros).

---

## 🧰 O que é JPA?

A **JPA (Java Persistence API)** é uma especificação do Java que facilita o mapeamento entre objetos Java e tabelas de banco de dados. Ela permite:

- ✅ Salvar objetos no banco de dados (persistir)
- ✅ Buscar dados como se fossem objetos Java
- ✅ Atualizar ou excluir dados de forma simples

---

## 📦 Comparação: Sem JPA vs Com JPA

### 🔸 Sem JPA (modo tradicional):

```java
String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
PreparedStatement stmt = connection.prepareStatement(sql);
// preencher os valores e executar...
```

Você precisa escrever SQL manualmente, lidar com conexões e gerenciar transações — o que é verboso e propenso a erros.

### 🔹 Com JPA:

```java
Produto produto = new Produto("Caneta Azul", 2.50);
entityManager.persist(produto);
```

Com JPA, o trabalho pesado é feito nos bastidores: conexão, construção do SQL e execução da transação.

---

## 🧱 Anotações JPA mais comuns

| Anotação           | Descrição |
|--------------------|-----------|
| `@Entity`          | Define a classe como uma entidade do banco de dados. |
| `@Table(name = "")`| (Opcional) Define o nome da tabela no banco. |
| `@Id`              | Define o campo como chave primária. |
| `@GeneratedValue`  | Especifica como o valor da chave será gerado. Ex: `GenerationType.IDENTITY`. |
| `@Column`          | Customiza a coluna: nome, tamanho, se é nula, etc. |
| `@OneToOne`        | Relacionamento um-para-um. |
| `@OneToMany`       | Um-para-muitos (ex: cliente → pedidos). |
| `@ManyToOne`       | Muitos-para-um (ex: pedidos → cliente). |
| `@ManyToMany`      | Muitos-para-muitos (ex: alunos ↔ cursos). |
| `@Transient`       | Campo ignorado pelo JPA (não é salvo no banco). |
| `@Enumerated`      | Para mapear enums como string ou número. |

---

## 📚 Leitura recomendada

Para se aprofundar em JPA, confira este artigo da DevMedia:  
👉 [Introdução à JPA - DevMedia](https://www.devmedia.com.br/introducao-a-jpa-java-persistence-api/28173)

---

## ✍️ Autor

**Felipe Rocha**  
📧 [felipevalboeno@hotmail.com](mailto:felipevalboeno@hotmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/fvalboeno)
