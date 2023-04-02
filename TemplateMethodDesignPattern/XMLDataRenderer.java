package TemplateMethodDesignPattern;

public class XMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processdata(String data) {
        return "Processing" + data;
    }
}
