# Dining Penguins
<p>In this problem, we are trying to simulate dining penguins. 4 penguins are sitting at the table, ready to eat their dinner. As you might know, penguin's habits are unusual: Each penguin needs exactly 2 forks to eat, but they have only 4 forks at the table.</p>
<h4 id="simulation">Simulation</h4>
<p>Penguins do not wait for each other to eat, they start dining simultaneously, that's why we use <code>Thread</code>s.</p>
<ul>
<li>Each penguin checks if there's a free fork on the table.</li>
<li>If there's any free fork penguin takes it and waits 1 second before taking another. If not, the penguin waits 0.5 seconds before checking free forks again.</li>
<li>After obtaining 2 forks, the penguin eats and returns both forks to the table.</li>
</ul>
<h4 id="problem">Problem</h4>
<p>If you run the code, you will see that none of the penguins start eating, no matter how long you wait. Your task is to find the problem behind this strange behavior and try to fix it.</p>
<h4 id="hint">Hint</h4>
<p>If you are stuck, google "the dining philosophers problem".</p></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
