package Ex2;

class Data {
    String type;
    Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }
}

abstract class DataProcessor {
    public abstract void process(Data data);
}

class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing text data...");
        TextContent textContent = (TextContent) data.content;
    }
}

class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing audio data...");
        AudioContent audioContent = (AudioContent) data.content;
    }
}

class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing video data...");
        VideoContent videoContent = (VideoContent) data.content;
    }
}

class TextContent {
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class AudioContent {
    private byte[] audioData;

    public AudioContent(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public void setAudioData(byte[] audioData) {
        this.audioData = audioData;
    }
}

class VideoContent {
    private byte[] videoData;
    private String format;

    public VideoContent(byte[] videoData, String format) {
        this.videoData = videoData;
        this.format = format;
    }

    public byte[] getVideoData() {
        return videoData;
    }

    public void setVideoData(byte[] videoData) {
        this.videoData = videoData;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}


class DataProcessorCreator {
    private DataProcessor processor;

    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    public void processData(Data data) {
        processor.process(data);
    }
}

public class RealTimeDataProcessingSystem {
    public static void main(String[] args) {
                DataProcessorCreator creator = new DataProcessorCreator();
                TextContent textContent = new TextContent("Sample text content");
                Data textData = new Data("text", textContent);
                creator.setProcessor(new TextDataProcessor());
                creator.processData(textData);
                byte[] audioBytes = new byte[]{0x12, 0x34, 0x56, 0x78}; // Пример аудио данных
                AudioContent audioContent = new AudioContent(audioBytes);
                Data audioData = new Data("audio", audioContent);
                creator.setProcessor(new AudioDataProcessor());
                creator.processData(audioData);
                byte[] videoBytes = new byte[]{0x12, 0x34, 0x56, 0x78}; // Пример видео данных
                VideoContent videoContent = new VideoContent(videoBytes, "mp4");
                Data videoData = new Data("video", videoContent);
                creator.setProcessor(new VideoDataProcessor());
                creator.processData(videoData);
            }
        }



