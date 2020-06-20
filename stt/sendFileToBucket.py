from google.cloud import storage
import os
import real_speechToText

# Uploads a file to the bucket
def upload_blob(bucket_name, source_file, destination_blob):

    storage_client = storage.Client()
    bucket = storage_client.bucket(bucket_name)
    blob = bucket.blob(destination_blob)

    blob.upload_from_filename(source_file)

    print("File {} uploaded to {}.".format(source_file, destination_blob))

    # local wav delete
    if os.path.isfile(source_file):
        os.remove(source_file)

        print('local wav delete okay')

    real_speechToText.response()
