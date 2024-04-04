package com.lld.design.patterns.singleton.v1;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl instance;

    private FileBasedConfigurationManagerImpl(){

    }
    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub

        String val = properties.getProperty(key);
        if(val != null){
            return this.convert(val, type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        properties.put(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        properties.put(key, value.toString());

    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);

    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if (instance == null){
            synchronized(FileBasedConfigurationManagerImpl.class) {
                if (instance == null){
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}