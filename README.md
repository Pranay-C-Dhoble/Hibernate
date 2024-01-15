<h1>Object-Relational Mapping (ORM)</h1>
<p>* It is a technique that helps developers interact with a database using the programming language they are using in their code (like Java, Python, or C#).</p>
<p>* Instead of writing SQL queries directly, developers can work with objects in their code</p>
<p>* And the ORM framework takes care of translating those objects into the database language (SQL) and vice versa.</p>
<h3>Example:- Imagine you have an object in your code representing a "User.</h3>
<p>* With ORM, you can save this user object to a database without having to write explicit SQL queries.</p>
<p>* The ORM framework handles the translation between your code's objects and the database's tables.</p>
<h1>Hibernate Frameworke</h1>
<p>* Hibernate is an ORM framework that allows developers to interact with a database using Java objects.</p>
<p>* Hibernate is an open-source, lightweight ORM tool that is used to develop Java applications to interact with the database.</p>

<p align="center">
<img alt="Pranay Dhoble" src="https://github.com/Pranay-C-Dhoble/Hibernate/blob/master/images/hibernet.png" width="7000">
</p>
<h1>Commonly Used Hibernate Annotation</h1>
<p>@Entity --> use to mark any class as Entity.</p>
<p>@Table --> use to change the table details.</p>
<p>@Id --> use to mark any field as primary key.</p>
<p>@GeneratedValue --> use to generate the value of primary key. Hibernate Automatically generate values for that using internal Sequence. Therefore we don't have to set it manually.</p>
<p>@Column --> use to change the column details. For example, to change the column name in the associated table in database</p>
<p>@Transient --> This tells hibernate not to save this field.</p>
<p>@Temporal --> over a data field tells hibernate the format in which the data needs to be saved.</p>
<p>@Lob --> tells hibernate that this is a large object, not a simple object.</p>
<p>@OneToOne --> use to define one to one relationship between two entities.</p>
<p>@OneToMany --> use to define one to many relationship between two entities.</p>
<p>@ManyToOne --> use to define many to one relationship between two entities.</p>
<p>@ManyToMany --> use to define many to many relationship between two entities.</p>
<p>@JoinColumn --> use to define the column details of the associated table.</p>
<p>@JoinTable --> use to define the join table details.</p>
<p>@OrderBy --> use to define the order of the associated data.</p>