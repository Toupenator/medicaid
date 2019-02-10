import paho.mqtt.client as mqtt
import ssl
import read_bottle

def onConnect(client, userdata, flags, rc):
	print('connected!')
	text = read_bottle.perscription(img=None)
	print(text)
	print('subscribing to topic')
	client.subscribe('test')
	print('publishing to topic')
	client.publish('test', 'hello world!')
	client.publish('test', text)

def onDisconnect(client, userdata, rc):
	print('disconnected!')

def onMessage(client, userdata, message):
	print('got message: ' + str(message.payload))



client = mqtt.Client(transport="websockets")
#client.tls_set(ca_certs=None, certfile=None, keyfile=None, cert_reqs=ssl.CERT_REQUIRED, tls_version=ssl.PROTOCOL_TLS, ciphers=None)
client.on_connect = onConnect
client.on_disconnect = onDisconnect
client.on_message = onMessage


client.username_pw_set('solace-cloud-client', password='s9u90c05ev26oilfl86s3bpoag')
client.connect('mr4b11zraqb.messaging.mymaas.net', 8000, 20)
client.loop_forever()
