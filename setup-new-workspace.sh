FORGE_VERSION='1.7.10-10.13.4.1492-1.7.10'
FORGE_FILE='./forge-source.zip'
EXTRACTING_DIRS='eclipse/*'

if [[ $1 == -h* ]] || [[ $1 == --h* ]];
then
	echo 'Downloads the forge src zip,'
	echo 'extracts the missing eclipse dir,'
	echo 'and removes the downloaded zip.'
	exit
fi

cd "$( dirname "$0" )"
wget -O $FORGE_FILE "http://files.minecraftforge.net/maven/net/minecraftforge/forge/$FORGE_VERSION/forge-$FORGE_VERSION-src.zip"
unzip $FORGE_FILE $EXTRACTING_DIRS
rm $FORGE_FILE
