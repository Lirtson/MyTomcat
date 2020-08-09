import java.io.IOException;
//MyServlet的实现类
public class HelloWorldServlet extends MyServlet{

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("get world...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("post world...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
