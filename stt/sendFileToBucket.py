from google.cloud import storage
import os

# Uploads a file to the bucket
def upload_blob(bucket_name, source_file, destination_blob):

    storage_client = storage.Client()
    bucket = storage_client.bucket(bucket_name)
    blob = bucket.blob(destination_blob)

    blob.upload_from_filename(source_file)

    print("File {} uploaded to {}.".format(source_file, destination_blob))

bucket = 'speech-bucket-jiwon'
source_file = 'C://Users//jeonjiwon//Desktop//capstone_jiwon//speechFile//record.wav'
destination_blob = 'record.wav'

upload_blob(bucket, source_file, destination_blob)

# local wav delete
if os.path.isfile(source_file):
    os.remove(source_file)

    print('okay')
