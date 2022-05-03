package fop.w11dining;

public class Penguin implements Runnable {

	private String name;
	private Table table;
	private static int count;
	private int upper, lower;

	public Penguin(String name, Table table) {
		this.name =  name;
		this.table = table;
		lower = count++;
		upper = count;
		if (upper == 4) {
			lower = 0;
			upper--;
		}

	}

	public void eat() {

		for(int i = 1; i <= 2; i++) {
			int index = upper;
			if (i == 2) index = lower;
			while(!table.forkAvailable(index)) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
		            System.out.println("Something went wrong. Interrupted!");
		            return;
		        }
	    	}

	    	table.takeFork(index);
	    	System.out.println(name + " takes fork #" + i);

	    	try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
		        System.out.println("Something went wrong. Interrupted!");
		        return;
		    }

    	}

    	System.out.println(name + " ate.");

		table.returnFork(upper);
		table.returnFork(lower);
	}

	@Override
	public void run() {
		eat();
	}

}

//36441600