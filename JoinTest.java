package thread_learn;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {

	/**
	 * 连个相称 threadA  threadB
	 * 进度条 JProgressBar:progressbar  and  progressbar2
	 */
	private static final long serialVersionUID = 772417818492549855L;
	private  Thread threadA;
	private  Thread threadB;
	final JProgressBar progressbar = new JProgressBar();
	final JProgressBar progressbar2 = new JProgressBar();
	
	public JoinTest(){
		super();
		getContentPane().add(progressbar,BorderLayout.NORTH);
		getContentPane().add(progressbar2, BorderLayout.SOUTH);
		
		progressbar.setStringPainted(true);
		progressbar2.setStringPainted(true);
		
		threadA =new Thread(new Runnable(){
			int count = 0;
			public void run(){
				while(true){
					progressbar.setValue(++count);
					try{
						Thread.sleep(300);
						threadB.join();
					}catch(Exception e){
						e.printStackTrace();
					}
					if(count == 100){
						return ;
					}
				}
			}
		});
		threadA.start();
		
		threadB = new Thread(new Runnable(){
			int count =0;
			public void run(){
				while(true){
					progressbar2.setValue(++count);
					try{
						Thread.sleep(100);
						}catch(Exception e){
							e.printStackTrace();
						}
					
					/*
					 * 如果想一直进行下去的话
					 * 可以在条件判断出，重新将count赋值为0；
					 * 
					 * if(count == 100){
					 * count = 0;
					 * }
					 * */
					if(count == 100)
						break;
				}
			}
		});
		threadB.start();
		
		
		}
	
		public static void init(JFrame frame,int width,int height){
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(width, height);
			frame.setVisible(true);
		}
		
		public static void main(String [] args){
			init(new JoinTest(),100,100);
		}
		
		
	
	}
