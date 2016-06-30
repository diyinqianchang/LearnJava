package niojava;

import java.nio.CharBuffer;

public class BufferTest {

	public static void main(String[] args) {
		CharBuffer buffer = CharBuffer.allocate(8);
		System.out.println("capacity" +buffer.capacity());
		System.out.println("limit "+buffer.limit());
		System.out.println("position "+buffer.position());
		buffer.put('a');
		buffer.put('b');
		buffer.put('c');
		System.out.println("3个position "+buffer.position());
		buffer.flip();
		System.out.println("flip() 后limit "+buffer.limit());
		System.out.println("元素0:"+buffer.get());
		System.out.println("取出元素后的:"+buffer.position());

	}

}
