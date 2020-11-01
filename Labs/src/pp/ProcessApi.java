package pp;


import java.util.Comparator;

public class ProcessApi {
	
	
	static void show(ProcessHandle  handle) {
		System.out.println(handle.pid());
		ProcessHandle.Info  obj=handle.info();
		obj.user().ifPresent(System.out::println);
		obj.command().ifPresent(System.out::println);
		obj.totalCpuDuration().ifPresent(System.out::println);
		obj.startInstant().ifPresent(System.out::println);
		obj.commandLine().ifPresent(System.out::println);
		obj.arguments().ifPresent(System.out::println);
	}
	public static void main(String[] args) {
		
		ProcessHandle  handle =ProcessHandle.current();
		show(handle);
		
		ProcessHandle.allProcesses().sorted(Comparator.comparing(ProcessHandle::pid,Long::compareTo)).forEach(ProcessApi::show);

	}

}
