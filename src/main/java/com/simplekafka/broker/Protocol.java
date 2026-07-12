
//through which client and brokers speak usin binary
public static final byte PRODUCE = 0x01;
public static final byte FETCH = 0x02;
public static final byte METADATA = 0x03;
public static final byte CREATE_TOPIC = 0x04;
    
// Broker response types
public static final byte PRODUCE_RESPONSE = 0x11;
public static final byte FETCH_RESPONSE = 0x12;

public static final byte CREATE_TOPIC_RESPONSE = 0x14;
public static final byte METADATA_RESPONSE = 0x13;

//TODO:shall cover these
public static ByteBuffer encodeProducRequest(String topic,int partition,btye[] message)
{//shall encoed a req to write/produce a message to specific topic
 

}



public static ByteBuffer encodeFetchRequest(String topic, int partition,  long offset, int maxBytes)
{
//req to read from a topic startin at offset

}
public static ByteBuffer encodeMetadataRequest(){

}
public static ByteBuffer encodeCreateTopicRequest(String topic, int numPartitions, short replicationFactor)
{

}
public static ProduceResult decodeProduceResponse(ByteBuffer buffer)
{
}
public static FetchResult decodeFetchResponse(ByteBuffer buffer){

}
public static MetadataResult decodeMetadataResponse(ByteBuffer buffer){
}
public static ByteBuffer encodeReplicateRequest(String topic, int partition, long offset, byte[] message){
}
public static ByteBuffer encodeTopicNotification(String topic){
}

public static void sendErrorResponse(SocketChannel channel, String errorMessage)
{
}

