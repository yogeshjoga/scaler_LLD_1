package AbstractAndInterface;

public class dsf {


//
//
//    public class TranslationRequest {
//        private String text; // The text to be translated
//        private String sourceLanguage; // The source language of the text
//        private String targetLanguage; // The target language for the translation
//        private Double confidenceThreshold; // The confidence threshold for the translation
//    }
//
//
//
//    // The TranslationProviderAdapter interface defines operations that all concrete translation adapters must implement.
//    public interface TranslationProviderAdapter {
//        String translate(TranslationRequest request); // Translates the text in the request
//
//      //  List<String> getSupportedLanguages(); // Returns a list of supported languages
//    }
//
//
//
//    // The GoogleTranslationAdapter class is an adapter for the GoogleTranslateApi.
//    public class GoogleTranslationAdapter implements TranslationProviderAdapter {
//
//        private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi(); // An instance of the adaptee class
//
//        // The translate method converts the TranslationRequest to a GoogleTranslationRequest and calls the convert method of the GoogleTranslateApi.
//        @Override
//        public String translate(TranslationRequest request) {
//            return googleTranslateApi.convert(to(request));
//        }
//
//        // The to method converts a TranslationRequest to a GoogleTranslationRequest.
//        private GoogleTranslationRequest to(TranslationRequest request) {
//            return new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(), request.getTargetLanguage(), 0.8);
//        }
//
//        // The getSupportedLanguages method returns the list of languages supported by the GoogleTranslateApi.
//        @Override
//        public List<String> getSupportedLanguages() {
//            return googleTranslateApi.getLanguages();
//        }
//    }
//
//
//
//    // The MicrosoftTranslationAdapter class is an adapter for the MicrosoftTranslateApi.
//    public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {
//        private MicrosoftTranslateApi translateApi = new MicrosoftTranslateApi(); // An instance of the adaptee class
//
//        // The translate method calls the translate method of the MicrosoftTranslateApi.
//        @Override
//        public String translate(TranslationRequest request) {
//            return translateApi.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
//        }
//
//        // The getSupportedLanguages method returns the list of languages supported by the MicrosoftTranslateApi.
//        @Override
//        public List<String> getSupportedLanguages() {
//            return translateApi.getSupportedLanguages();
//        }
//    }
}
